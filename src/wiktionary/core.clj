(ns wiktionary.core
  (:gen-class)
  (require [wiktionary.html-reader :as html-reader])
  (require [wiktionary.html-language-content :as html-language-content])
  (require [wiktionary.html-word-definitions :as html-word-definitions]))


(defn -get-definitions [language word]
  (let [html (html-reader/read word)]
    (if (nil? html)
      nil
      (let [languageElements (html-language-content/extract language html)]
        (if (not-empty languageElements)
          (println (html-word-definitions/extract languageElements))
          nil)))))

(defn -main []
  (-get-definitions "english" "stop"))
