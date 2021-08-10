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
SRCREV = "d5ad97f2f1dc02913354bc9be6016999c6dd40c7"
S = "${WORKDIR}/git"
