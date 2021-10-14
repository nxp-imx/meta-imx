WESTON_SRC ?= "git://source.codeaurora.org/external/imx/weston-imx.git;protocol=https"
SRC_URI = " \
    ${WESTON_SRC};branch=${SRCBRANCH} \
    file://weston.png \
    file://weston.desktop \
    file://xwayland.weston-start \
    file://0001-weston-launch-Provide-a-default-version-that-doesn-t.patch \
"
SRCREV = "e73c641e076aa68e8ef69dbd56c7a252117b2c83"

EXTRA_OEMESON_remove = "-Dbackend-rdp=false"
PACKAGECONFIG_append = " rdp"
PACKAGECONFIG[rdp] = "-Dbackend-rdp=true,-Dbackend-rdp=false,freerdp"
