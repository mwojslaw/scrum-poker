(ns scrum_poker.state
  (:require [reagent.core :as r]))

;; atoms
(def cardsByIds (r/atom {:0 {:name "0" :id "0"}
                         :1 {:name "1" :id "1"}
                         :2 {:name "2" :id "2"}
                         :3 {:name "3" :id "3"}
                         :4 {:name "4" :id "4"}
                         :5 {:name "5" :id "5"}
                         :8 {:name "8" :id "8"}
                         :13 {:name "13" :id "13"}
                         :20 {:name "20" :id "20"}}))

(def selectedCardId (r/atom 0))

;; selectors

(defn getCards [] (sort-by :id (vals @cardsByIds)))

;; actions
(defn changeSelectedCardId [id] (reset! selectedCardId id))