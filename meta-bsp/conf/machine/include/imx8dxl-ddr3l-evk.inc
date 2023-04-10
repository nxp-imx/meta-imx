#@TYPE: Machine
#@NAME: i.MX 8DXL EVK with DDR3
#@SOC: i.MX8DXL
#@DESCRIPTION: NXP i.MX 8DXLite Evaluation Kit with DDR3
#@MAINTAINER: Lauren Post <lauren.post@nxp.com>

require conf/machine/include/imx8dxl-evk.inc
KERNEL_DEVICETREE_BASENAME = "imx8dxl-ddr3l-evk"
KERNEL_DEVICETREE:append:use-nxp-bsp = " \
    freescale/${KERNEL_DEVICETREE_BASENAME}.dtb \
    freescale/${KERNEL_DEVICETREE_BASENAME}-rpmsg.dtb \
"
UBOOT_CONFIG_BASENAME = "imx8dxl_ddr3l_evk"
UBOOT_CONFIG[nand] = "${UBOOT_CONFIG_BASENAME}_nand_defconfig"

BOARD_TYPE = "ddr3-evk"
