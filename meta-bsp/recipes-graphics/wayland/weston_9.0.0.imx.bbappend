WESTON_SRC ?= "git://source.codeaurora.org/external/imx/weston-imx.git;protocol=https"
SRC_URI = " \
    ${WESTON_SRC};branch=${SRCBRANCH} \
    file://weston.png \
    file://weston.desktop \
    file://xwayland.weston-start \
    file://0001-weston-launch-Provide-a-default-version-that-doesn-t.patch \
"
SRCREV = "a6e977acd224f5f145b64141820bad41c4caca38"

EXTRA_OEMESON:remove = "-Dbackend-rdp=false"
PACKAGECONFIG:append = " rdp"
PACKAGECONFIG[rdp] = "-Dbackend-rdp=true,-Dbackend-rdp=false,freerdp"
