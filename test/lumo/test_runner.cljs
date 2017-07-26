(ns lumo.test-runner
  (:require [clojure.test :refer [run-tests]]
            [lumo.js-deps-tests]
            [lumo.repl-tests]))

(defn run-all-tests []
  (run-tests
    'lumo.repl-tests
    'lumo.js-deps-tests))
