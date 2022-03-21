(ns net.drilling.paws.core
  (:require [cognitect.aws.client.api :as aws]))

(def s3 (aws/client {:api :s3}))

(defn available-ops [client-name] (keys (aws/ops client-name)))

(available-ops s3)
(aws/invoke s3 {:op :ListBuckets})
