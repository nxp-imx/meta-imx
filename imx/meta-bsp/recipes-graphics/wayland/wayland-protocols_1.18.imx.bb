require recipes-graphics/wayland/wayland-protocols_1.17.imx.bb

WAYLAND_PROTOCOLS_SRC ?= "git://source.codeaurora.org/external/imx/wayland-protocols-imx.git;protocol=https"
SRCBRANCH = "wayland-protocols-imx-1.18"
SRC_URI = "${WAYLAND_PROTOCOLS_SRC};branch=${SRCBRANCH} "
SRCREV = "e05c19d9520f0b1289cf0844d6e2f877114f39d5"
S = "${WORKDIR}/git"
