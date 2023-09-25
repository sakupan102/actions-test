(ns test.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn add-five
  [x]
  (+ 5 x))

(println (add-five 3))
(foo "tanaka")


