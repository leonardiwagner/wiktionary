(ns wiktionary.html-reader)

(defn- read-http-page [url]
  (try
    (slurp url)
    (catch java.io.FileNotFoundException e nil)))

(defn read [word]
  (->
    (format "https://en.wiktionary.org/wiki/%s" word)
    (read-http-page)))
