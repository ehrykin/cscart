(ns cscart.views
    (:require [re-frame.core :as re-frame]))

(defn main-panel []
  (let [name (re-frame/subscribe [:name])]
    (fn []
      (let [
            ;;antd (aget js/window "antd")
            layout (aget js/window "antd" "Layout")
            sider (aget layout "Sider")
            header (aget layout "Header")
            menu (aget js/window "antd" "Menu")
            menu-item (aget js/window "antd" "Menu" "Item")
            icon (aget js/window "antd" "Icon")
            content (aget layout "Content")
            ;;footer (aget antd "Footer")
            ]
        ;;[:div "Hello from " @name]
        [:> layout
          [:> sider {:collapsible true} "Sider"
              [:div {:class-name "logo"}]
              [:> menu {:thene "dark" :mode "inline" }
                     [:> menu-item {:key 1}
                      [:> icon {:type "user"}]
                      [:span {:class-name "nav-text"} "nav 1"]]
                     [:> menu-item {:key 2}
                      [:> icon {:type "video-camera"}]
                      [:span {:class-name "nav-text"} "nav 2"]]
                     [:> menu-item {:key 3}
                      [:> icon {:type "upload"}]
                      [:span {:class-name "nav-text"} "nav 3"]]]
           ]
          [:> layout
           [:> header {:style {:background "#fff" :padding 0}}
            [:> icon {:class-name "trigger" :type "menu-unfold"}]
            ]
           [:> content {:style {:margin "24px 16px" :background "#fff" :min-height 280}} "Content"]
           ]
         ])
      )
    )
)