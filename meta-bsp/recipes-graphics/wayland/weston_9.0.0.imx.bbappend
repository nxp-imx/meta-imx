WESTON_SRC ?= "git://source.codeaurora.org/external/imx/weston-imx.git;protocol=https"
SRC_URI = " \
    ${WESTON_SRC};branch=${SRCBRANCH} \
    file://weston.png \
    file://weston.desktop \
    file://xwayland.weston-start \
    file://0001-weston-launch-Provide-a-default-version-that-doesn-t.patch \
"
SRCREV = "a31d99dfc057cf0162b06524d706ce19478a019f"

EXTRA_OEMESON_remove = "-Dbackend-rdp=false"
PACKAGECONFIG_append = " rdp"
PACKAGECONFIG[rdp] = "-Dbackend-rdp=true,-Dbackend-rdp=false,freerdp"
