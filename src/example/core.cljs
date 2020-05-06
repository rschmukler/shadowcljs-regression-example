(ns example.core
  (:require [clojure.core.async :refer [go]]))

(defn main
  []
  (go
    (println "Hello world")))
