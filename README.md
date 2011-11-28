# koan-template

A Leiningen template for standalone koan projects based on the [Clojure Koan Engine](https://github.com/functional-koans/clojure-koan-engine).

## Usage

Run the following commands to install `koan-template` and create a new, custom koan project:

    lein plugin install lein-newnew 0.1.2
    lein plugin install koan-template 0.1.0
    lein new koan <your-project-name>
    cd <your-project-name>
    chmod +x script/*

And you're set! Run `lein deps && lein koan run` to see the included example koan. The README of the resulting project will contain everything your users need to know to get started.

## Customizing your new project

All new projects will require the following steps:

- add custom dependencies to `project.clj`. (Clojure defaults to 1.3.0, but feel free to roll back to 1.2.1 if your library needs it.)
- Delete the example koan at `src/koans/example_koan.clj` (or add to it!)
- Add APIs and other namespaces to the Dojo, as discussed on the [koan-engine wiki](https://github.com/functional-koans/clojure-koan-engine).
- Write some more koans using the instructions at the [koan-engine github page](https://github.com/functional-koans/clojure-koan-engine).
- Add proper solutions to `resources/koans.clj`

And that's it! The template handles all structure, leaving you to craft puzzles and delight users. Once you've got `lein koan test` passing again, make your code available to the world and await your students.

## Standalone Distribution

koan-template includes the `lein-koan` plugin by default, as this tends to be the most familiar way for users to get up and running. If you're interested in reaching users without leiningen (as with [clojure-koans](https://github.com/functional-koans/clojure-koans)), it can make sense to bundle a release version by running

    script/bundle.sh

This command creates a zipfile with all dependencies suitable for standalone distribution. The following scripts are included in the template for non-leiningen users on Mac/\*nix:

    script/run
    script/test
    script/repl

And on Windows:

    script\run
    script\test
    script\repl

## Acknowledgements

Koan-template rides on [lein-newnew](https://github.com/Raynes/lein-newnew) by Raynes, a young jedi who you've almost certainly heard of.

### License

The use and distribution terms for this software are covered by the
Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
which can be found in the file epl-v10.html at the root of this distribution.
By using this software in any fashion, you are agreeing to be bound by
the terms of this license.
