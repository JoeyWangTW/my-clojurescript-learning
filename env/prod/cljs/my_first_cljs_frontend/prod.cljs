(ns my-first-cljs-frontend.prod
  (:require
    [my-first-cljs-frontend.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
