(ns my_first_cljs_frontend.components.number
  (:require [my_first_cljs_frontend.state :as state]))
(defn number
  []
  [:div
   [:div.m-5
    [:div "Cilck to change the number"]
    [:div (str "You got: " (get-in @state/number ["num"]))]]
   [:div.row
    [:div.col-sm-2]
    [:div.col-sm-4
     [:div.btn.btn-primary.btn-block.m-2
      {:data-tooltip "click it"
       :on-click (fn [] (swap! state/number update "num" inc))}
      "Add"]]
    [:div.col-sm-4
     [:div.btn.btn-secondary.btn-block.m-2
      {:on-click (fn [] (swap! state/number update "num" dec))}
      "Subtract"]]
    [:div.col-sm-2]]])