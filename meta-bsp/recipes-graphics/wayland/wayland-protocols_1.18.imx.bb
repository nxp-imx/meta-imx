require recipes-graphics/wayland/wayland-protocols_1.17.imx.bb

WAYLAND_PROTOCOLS_SRC ?= "git://source.codeaurora.org/external/imx/wayland-protocols-imx.git;protocol=https"
SRCBRANCH = "wayland-protocols-imx-1.18"
SRC_URI = "${WAYLAND_PROTOCOLS_SRC};branch=${SRCBRANCH} "
SRCREV = "ee18c1f66877f7fb652467c349108395c20d4f9a"
S = "${WORKDIR}/git"
