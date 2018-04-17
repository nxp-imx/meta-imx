# Use i.MX fork
SRC_URI_remove = "git://anongit.freedesktop.org/mesa/kmscube;branch=master;protocol=git"
KMSCUBE_SRC ?= "git://source.codeaurora.org/external/imx/kmscube-imx.git;protocol=https"
SRCBRANCH = "imx-kmscube"
SRC_URI_prepend = "${KMSCUBE_SRC};branch=${SRCBRANCH} "
SRCREV = "4a5c98b6ab1cf49f499d56d91270de21f3febe69" 
