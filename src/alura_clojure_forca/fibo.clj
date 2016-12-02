(ns alura-clojure-forca.fibo
  (:gen-class))

(defn fibo [n]
  (if (= n 0) 0
  (if (= n 1) 1
  (+ (fibo (- n 1)) (fibo (- n 2)))
  )))

(defn fibo2 [x]
  (loop [a 1 b 1 numero 2]
    (if
      (= numero x) b
      (recur b (+ a b) (inc numero)))))

(defn soma [n]
  (loop [contador 1 soma 0]
    (if (> contador n) soma
    (recur (inc contador) (+ soma contador)))))
