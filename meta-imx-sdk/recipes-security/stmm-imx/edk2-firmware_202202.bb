SRCREV_edk2           ?= "b24306f15daa2ff8510b06702114724b33895d3c"
SRCREV_edk2-platforms ?= "c9e377b00fc086fcb5a5b41663a0149bde9bcc2e"

require edk2-firmware.inc

SRC_URI:append:imx-nxp-bsp = " file://0001-BaseTools-fix-gcc12-warning-GenFfs.patch"
SRC_URI:append:imx-nxp-bsp = " file://0002-BaseTools-fix-gcc12-warning.patch"
SRC_URI:append:imx-nxp-bsp = " file://0003-Basetools-turn-off-gcc12-warning.patch"
