require imx-gpu-sdk.inc

SDK_BRANCH ?= "master"

SRC_URI = "git://github.com/NXPmicro/gtec-demo-framework.git;protocol=http;branch=${SDK_BRANCH}"
SRCREV = "16840f3d0333a6e0474e5329d4aaaaf71823f2f9"
