(ns wiktionary.page-reader)

(defn- read-http-page [url]
  (try
    (slurp url)
    (catch java.io.FileNotFoundException e nil)))

(defn read-page [word]
  (->
    (format "https://en.wiktionary.org/wiki/%s" word)
    (read-http-page)))
