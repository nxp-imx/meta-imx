FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += " file://0001-ethosu.hpp-Fix-gcc15-build-issues.patch"
SRCBRANCH = "imx_24.05"
SRCREV = "a80c51d77c91f1a8266afc5d8056fb981de4b504"

EXTRA_OECMAKE += "\
    -DCMAKE_POLICY_VERSION_MINIMUM=3.5 \
"
