(ns cscart.runner
    (:require [doo.runner :refer-macros [doo-tests]]
              [cscart.core-test]))

(doo-tests 'cscart.core-test)
