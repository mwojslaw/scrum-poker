(ns scrum_poker.components
  (:require [scrum_poker.state :as state]))

(defn card [name] [:h1 name])

(defn cards [] [:div (map (fn [c] (card (:name c))) (vals @state/cardsByIds))])