# {{name}}

Koans are a fun and easy way to learn a clojure project - no
experience assumed or required.  Just follow the instructions below to
start making tests pass!

### Getting Started

run `lein deps` in the project directory. This will download all dependencies you need to run the koans.

### Running the Koans

To run the koans, simply run

`script/run` on Mac/\*nix

`script\run` on Windows

It's an auto-runner, so as you save your files with the correct answers, it will
advance you to the next koan or file.

You'll see something like this:

    Problem in  /home/paduan/code/{{name}}/src/koans/equalities.clj
    ---------------------
    Assertion failed!
    We shall contemplate truth by testing reality, via equality.
    (= __ true)

The output is telling you that you have a failing test in equalities.clj.
Open that file up and make it pass!  In general, you just fill in the
blanks to make tests pass.  Sometimes there are several (or even an infinite
number) of correct answers: any of them will work in these cases.

The koans differ from normal TDD in that the tests are already written for you,
so you'll have to pay close attention to the failure messages, because up until
the very end, making a test pass just means that the next failure message comes
up.

While it might be easy (especially at first) to just fill in the blanks making
things pass, you should work thoughtfully, making sure you understand why the
answer is what it is.  Enjoy your path to enlightenment!

### Trying more things out

There's a REPL (Read-Evaluate-Print Loop) included in the Clojure Koans. Just
run:

`script/repl` on Mac/\*nix

`script\repl` on Windows

Here are some interesting commands you might try, once you're in a running REPL:

```clojure
(find-doc "vec")
(find-doc #"vec$")
(doc vec)
```

And if those still don't make sense:

```clojure
(doc doc)
(doc find-doc)
```

will show you what those commands mean.

You can exit the REPL with `CTRL-d` on any OS.

### License

Copyright (C) 2011 FIXME

Distributed under the Eclipse Public License, the same as Clojure.
