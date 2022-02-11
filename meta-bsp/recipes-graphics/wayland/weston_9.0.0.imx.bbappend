WESTON_SRC_CAF = "git://source.codeaurora.org/external/imx/weston-imx.git;protocol=https"
WESTON_SRC ?= "${WESTON_SRC_CAF}"
# If WESTON_SRC is overridden, override the main SRC_URI
SRC_URI:remove = \
    "${@bb.utils.contains('${WESTON_SRC}', '${WESTON_SRC_CAF}', \
        '', \
        '${WESTON_SRC_CAF};branch=${SRCBRANCH}', d)}"
SRC_URI:prepend = \
    "${@bb.utils.contains('${WESTON_SRC}', '${WESTON_SRC_CAF}', \
        '', \
        '${WESTON_SRC};branch=${SRCBRANCH} ', d)}"
SRCREV = "7859a762617682bd804e210ad3bda6bdcd3ea24a"

EXTRA_OEMESON:remove = "-Dbackend-rdp=false"
PACKAGECONFIG:append = " rdp"
PACKAGECONFIG[rdp] = "-Dbackend-rdp=true,-Dbackend-rdp=false,freerdp"
