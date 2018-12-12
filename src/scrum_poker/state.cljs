(ns scrum_poker.state (:require [reagent.core :as r]))

(def cardsByIds (r/atom {:0 {:name "0"}
                         :1 {:name "1"}}))

