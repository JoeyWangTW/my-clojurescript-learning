(ns my-first-cljs-frontend.core
    (:require
     [reagent.core :as r]
     [reagent.dom :as d]
     [my_first_cljs_frontend.components.number :refer [number]]
     
     ))

;; -------------------------
;; Views
;; 

(defn home-page []
  [:div.jumbotron.text-center
   [:div.container
    [:h2 "Welcome to my first cljs website"
     [:span.badge.badge-secondary.m-2 "NEW"]]
    [number]
    ]])

;; -------------------------
;; Initialize app

(defn mount-root []
  (d/render [home-page] (.getElementById js/document "app")))

(defn init! []
  (mount-root))
