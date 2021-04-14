SRC_URI_remove = "https://wayland.freedesktop.org/releases/${BPN}-${PV}.tar.xz \
                  file://0001-tests-include-fcntl.h-for-open-O_RDWR-O_CLOEXEC-and-.patch"
WESTON_SRC ?= "git://source.codeaurora.org/external/imx/weston-imx.git;protocol=https"
SRC_URI = " \
    ${WESTON_SRC};branch=${SRCBRANCH} \
    file://weston.png \
    file://weston.desktop \
    file://xwayland.weston-start \
    file://0001-weston-launch-Provide-a-default-version-that-doesn-t.patch \
"
SRCREV = "230e9bc3d647e511e0601e3d45034f22495ed3c7" 
S = "${WORKDIR}/git"
