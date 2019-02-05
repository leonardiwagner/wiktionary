# wiktionary
get word definitions from wikitionary.org


- `(get-definitions word language)`
  - **word** *String*: word to search definitions.
  - **language** *String (optional)*: word language. Default: english.

```clojure
(require [wiktionary.core :as wiktionary])

(wiktionary/get-definitions "stop" "english")
;["verb" "noun" "adverb" "noun" "adjective"]
```
