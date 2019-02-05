(ns wiktionary.html-parser-test
  (:require [clojure.test :refer :all]
            [wiktionary.html-parser :as page-reader]))

(deftest return-large-data-for-existing-word
  (let [result (page-reader/read-page "you")]
    (is (instance? String result))
    (is (> (count result) 500000))))

(deftest return-nil-for-non-existent-word
  (is (nil?
        (page-reader/read-page "yyyy"))))
