# Use i.MX fork
SRC_URI_remove = "git://anongit.freedesktop.org/mesa/kmscube;branch=master;protocol=git \
                  file://detect-gst_bo_map-_unmap-and-use-it-or-avoid-it.patch"
KMSCUBE_SRC ?= "git://source.codeaurora.org/external/imx/kmscube-imx.git;protocol=https"
SRCBRANCH = "imx-kmscube"
SRC_URI_prepend = "${KMSCUBE_SRC};branch=${SRCBRANCH} "
SRCREV = "0c57aa79c746c7474ecbbfe5d089dd3475cbbc65"
