(ns leiningen.new.koan
  (:use leiningen.new.templates))

(def render (renderer "koan"))

(defn koan
  "Koan-generating template, in the style of clojure-koans."
  [name]
  (let [data {:name name
              :sanitized (sanitize name)
              :koan-name "example_koan"}]
    (println "Generating a koan template called" name ". Namaste!")
    (->files data
             ["project.clj" (render "project.clj" data)]
             ["README.md" (render "README.md" data)]
             [".gitignore" (render "gitignore" data)]
             ["src/koans/{{koan-name}}.clj" (render "example_koan.clj" data)]
             ["resources/dojo.clj" (render "resources/dojo.clj" data)]
             ["resources/koans.clj" (render "resources/koans.clj" data)]
             ["script/bundle.sh" (render "script/bundle.sh" data)]
             ["script/run" (render "script/run" data)]
             ["script/run.bat" (render "script/run.bat" data)]
             ["script/run.clj" (render "script/run.clj" data)]
             ["script/test" (render "script/test" data)]
             ["script/test.bat" (render "script/test.bat" data)]
             ["script/test.clj" (render "script/test.clj" data)]
             ["script/repl" (render "script/repl" data)]
             ["script/repl.bat" (render "script/repl.bat" data)])))
