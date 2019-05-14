(ns wiktionary.result-builder
  (require [wiktionary.pronunciation-reader :as pronunciation-reader])
  (require [wiktionary.definitions-reader :as definitions-reader]))

(defn build-result [htmlElements]
  (let [pronunciation (pronunciation-reader/get-pronunciation htmlElements)
        definitions (definitions-reader/get-definitions htmlElements)]
       {:pronunciation pronunciation
        :definitions definitions}))
