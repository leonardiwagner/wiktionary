(ns wiktionary.html-word-definitions
  (require [net.cgrand.enlive-html :as html]))

(defn- get-elements-with-definition [htmlElements]
  (filter
    #(cond
        (= (:tag %) :h3) true
        (= (:tag %) :h4) true
        :else false)
    htmlElements))

(defn- get-elements-definiton-text [htmlElements]
  (map #(clojure.string/lower-case (first (:content (first (:content %))))) htmlElements))

(defn get-official-definitions [definitions]
  (let [official-definitions ["pronoun", "verb", "noun", "adjective", "adverb"]]
    (reduce
      (fn [acc, definition]
        (if (some #{definition} official-definitions)
          (conj acc definition)
          acc))
      []
      definitions)))

(defn extract [htmlElements]
  (-> htmlElements
    (get-elements-with-definition)
    (get-elements-definiton-text)
    (get-official-definitions)))
