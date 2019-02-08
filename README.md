# wiktionary
get word definitions from wikitionary.org

[![Build Status](https://travis-ci.org/leonardiwagner/wiktionary.svg?branch=master)](https://travis-ci.org/leonardiwagner/wiktionary)
[![Dependencies Status](https://versions.deps.co/leonardiwagner/wiktionary/status.svg)](https://versions.deps.co/leonardiwagner/wiktionary)
[![Clojars Project](https://img.shields.io/clojars/v/wiktionary.svg)](https://clojars.org/wiktionary)

## How to use
- Leiningen/Boot
  ```clojure
  [wiktionary "0.0.3-SNAPSHOT"]
  ```

- Require the library:
  ```clojure
  (:require [wiktionary.core :as wiktionary])
  ```
## Documentation
- **get-definitions**
<br>`(get-definitions word)`
<br>`(get-definitions word language)`

  Search for definitions for provided `word`. <br>If `language` is not provided `"english"` will be the default value.
  <br>The return is a list of definitions.

  Example:
  ```clojure
  (wiktionary/get-definitions "stop" "english")
  ;["verb" "noun" "adverb" "noun" "adjective"]
  ```

  The possible return values are: `["pronoun", "verb", "noun", "adjective", "adverb", "conjunction", "preposition", "interjection", "letter", "numeral", "article", "particle", "mutation", "determiner", "participle", "circumposition"]`

## Contributing
Feel free to contribute 🤗, just create an issue before submiting a PR.

## License

[Apache 2.0][apache-license]

[apache-license]:./LICENSE
