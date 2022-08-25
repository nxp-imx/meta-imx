#######################################################################
# BEGIN SRC_URI override section
#
# The following logic is for overriding the SRC_URI logic in the main recipe,
# so ignore it when upstreaming.
#
#   !!! DO NOT ADD UNRELATED LOGIC IN THIS SECTION !!!
#
WESTON_SRC_CAF = "git://github.com/nxp-imx/weston-imx.git;protocol=https"
WESTON_SRC ?= "${WESTON_SRC_CAF}"
# If WESTON_SRC is overridden, override the main SRC_URI
SRC_URI:remove = \
    "${@bb.utils.contains('WESTON_SRC', '${WESTON_SRC_CAF}', \
        '', \
        '${WESTON_SRC_CAF};branch=${SRCBRANCH}', d)}"
SRC_URI:prepend = \
    "${@bb.utils.contains('WESTON_SRC', '${WESTON_SRC_CAF}', \
        '', \
        '${WESTON_SRC};branch=${SRCBRANCH} ', d)}"
#
#   !!! DO NOT ADD UNRELATED LOGIC IN THIS SECTION !!!
#
# END SRC_URI override section
#######################################################################
