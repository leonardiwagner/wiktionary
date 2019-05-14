(ns wiktionary.pronunciation-reader
  (require [net.cgrand.enlive-html :as html])
  (:require clojure.pprint))


(defn split-definitions [htmlElements]
  (reduce
    (fn [acc, element]
      (let [elementTag (:tag element)]
        (if (= elementTag :h3)
          (let [elementText (first (:content (first (:content element))))]
            (assoc acc elementText []))
          (let [[key val] (last acc)]
            (update-in acc [key] conj element)))))
    {}
    htmlElements))


(defn get-pronunciation [htmlElements]
  (-> htmlElements
    (split-definitions)))
