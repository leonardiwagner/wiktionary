(ns wiktionary.language-extractor
  (require [net.cgrand.enlive-html :as html]))

(defn- remove-empty-children-elements [htmlElements]
  (filter #(not (instance? String %)) htmlElements))

(defn- language-title-element? [htmlElement]
  (-> htmlElement
    (html/select [:h2])
    (not-empty)))

(defn- specified-language? [language specified-language]
  (and
    (not-empty language)
    (= (clojure.string/lower-case language) specified-language)))

(defn- specified-language-title-element? [htmlElement language]
  (-> htmlElement
    (html/select [:h2])
    (first)
    (:content)
    (first)
    (:attrs)
    (:id)
    (specified-language? language)))

(defn- get-language-content [htmlElements language]
  (let [from-language-start (drop-while #(not (specified-language-title-element? % language)) htmlElements)
        until-language-end  (take-while #(not (language-title-element? %)) (rest from-language-start))]
    until-language-end))

(defn extract [html language]
  (-> html
    (html/html-snippet)
    (html/select [:div.mw-parser-output])
    (first)
    (:content)
    (remove-empty-children-elements)
    (get-language-content language)))
