(ns scrum_poker.components
  (:require [scrum_poker.state :refer [getCards selectedCardId changeSelectedCardId]]))

(defn card
  [id name onSelect isSelected]
  [:h1 {:key name :on-click (fn [] (onSelect id))} id (if isSelected "Selected" "")])

(defn cards
  [allCards selectedCardId changeSelectedCardId]
  [:div
   (map (fn [c]
          (card (:id c) (:name c) (fn [id] (changeSelectedCardId id)) (= (:id c) selectedCardId)))
        allCards)])

(defn app
  []
  [:div.container (cards (getCards) @selectedCardId changeSelectedCardId)])