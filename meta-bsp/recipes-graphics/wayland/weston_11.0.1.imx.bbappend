#######################################################################
# BEGIN SRC_URI override section
#
# The following logic is for overriding the SRC_URI logic in the main recipe,
# so ignore it when upstreaming.
#
#   !!! DO NOT ADD UNRELATED LOGIC IN THIS SECTION !!!
#
# If WESTON_SRC is overridden, override the main SRC_URI
SRC_URI:remove = \
    "${@bb.utils.contains('WESTON_SRC', '${WESTON_SRC_DEFAULT}', \
        '', \
        '${WESTON_SRC_DEFAULT};branch=${SRCBRANCH}', d)}"
SRC_URI:prepend = \
    "${@bb.utils.contains('WESTON_SRC', '${WESTON_SRC_DEFAULT}', \
        '', \
        '${WESTON_SRC};branch=${SRCBRANCH} ', d)}"
WESTON_SRC ?= "${WESTON_SRC_DEFAULT}"
WESTON_SRC_DEFAULT = "git://github.com/nxp-imx/weston-imx.git;protocol=https"
#
#   !!! DO NOT ADD UNRELATED LOGIC IN THIS SECTION !!!
#
# END SRC_URI override section
#######################################################################
