(ns wiktionary.core
  (:gen-class)
  (require [wiktionary.page-reader :as page-reader])
  (require [wiktionary.language-extractor :as language-extractor])
  (require [wiktionary.result-builder :as result-builder]))

(defn get-definitions
  ([word]
   (get-definitions word "english"))
  ([word language]
   (some-> (page-reader/read-page word)
     (language-extractor/extract language)
     (result-builder/build-result))))
