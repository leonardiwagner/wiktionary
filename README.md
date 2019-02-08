# wiktionary
get word definitions from wikitionary.org

## How to use
- Add this library on `:dependencies` in your project.clj file:
  ```clojure
  [wiktionary "0.0.2-SNAPSHOT"]
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
