java_binary(
    name = "Sample",
    srcs = glob(["src/main/java/com/example/*.java"]),
    deps = [
        ":label_java_proto",
        "@maven//:com_squareup_okhttp3_okhttp",
    ],
)

load("@rules_proto//proto:defs.bzl", "proto_library")
load("@rules_java//java:defs.bzl", "java_proto_library")

proto_library(
    name = "label_proto",
    srcs = ["src/main/java/com/example/protos/label.proto"],
)

java_proto_library(
    name = "label_java_proto",
    deps = [":label_proto"],
)
