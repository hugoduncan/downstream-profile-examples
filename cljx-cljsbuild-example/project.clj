(defproject cljx-cljsbuild-example "0.1.0-SNAPSHOT"
  :description "Example project using cljx, cljsbuild"
  :url "https://github.com/hugoduncan/downstream-profile-examples"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2322"]]
  :profiles {:downstream [:plugin.cljx/mixed-source
                          :plugin.cljsbuild/mixed-source
                          :plugin.cljsbuild/with-generated-source]
             :dev [:plugin.cljx/mixed-test
                   :plugin.cljsbuild/mixed-source-dev
                   :plugin.cljsbuild/with-generated-source-dev]}
  :hooks [cljx.hooks leiningen.cljsbuild]
  :plugins [[com.keminglabs/cljx "hd-0.4.1-SNAPSHOT"]
            [lein-cljsbuild "1.0.4-SNAPSHOT"]
            [lein-pprint "1.1.1"]       ; user level profiles seem broken
            [lein-modules "0.3.8"]])
