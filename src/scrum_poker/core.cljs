(ns scrum_poker.core
  (:require [reagent.core :as r]
            [scrum_poker.components :refer [app]]))

(defn ^:export main
  []
  (r/render
   [app]
   (.getElementById js/document "app")))
