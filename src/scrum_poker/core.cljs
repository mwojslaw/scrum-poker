(ns scrum_poker.core
  (:require [reagent.core :as r]
            [scrum_poker.components :refer [cards]]))

(defn app
  []
  [:div.container [cards]])

(defn ^:export main
  []
  (r/render
   [app]
   (.getElementById js/document "app")))