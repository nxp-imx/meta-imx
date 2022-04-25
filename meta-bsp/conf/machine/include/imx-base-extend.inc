# This file is included from meta-freescale/conf/machine/include/imx-base.inc
# and provides a simple mechanism to override settings in the file

# i.MX 8M Nano UltraLite
MACHINEOVERRIDES_EXTENDER:mx8mnul:use-nxp-bsp = "imx-generic-bsp:imx-nxp-bsp:imxfbdev:mx8-generic-bsp:mx8-nxp-bsp:mx8m-generic-bsp:mx8m-nxp-bsp:mx8mnul-generic-bsp:mx8mnul-nxp-bsp"
MACHINEOVERRIDES_EXTENDER:mx8mnul:use-mainline-bsp = "imx-generic-bsp:imx-mainline-bsp:mx8-generic-bsp:mx8-mainline-bsp:mx8m-generic-bsp:mx8m-mainline-bsp:mx8mnul-generic-bsp:mx8mnul-mainline-bsp"
MACHINEOVERRIDES_EXTENDER_FILTER_OUT += "mx8mnul"
MACHINE_SOCARCH_SUFFIX:mx8mnul-nxp-bsp = "-mx8mnul"

# i.MX 8M Plus UltraLite
MACHINEOVERRIDES_EXTENDER:mx8mpul:use-nxp-bsp = "imx-generic-bsp:imx-nxp-bsp:imxfbdev:mx8-generic-bsp:mx8-nxp-bsp:mx8m-generic-bsp:mx8m-nxp-bsp:mx8mpul-generic-bsp:mx8mpul-nxp-bsp"
MACHINEOVERRIDES_EXTENDER:mx8mpul:use-mainline-bsp = "imx-generic-bsp:imx-mainline-bsp:mx8-generic-bsp:mx8-mainline-bsp:mx8m-generic-bsp:mx8m-mainline-bsp:mx8mpul-generic-bsp:mx8mpul-mainline-bsp"
MACHINEOVERRIDES_EXTENDER_FILTER_OUT += "mx8mpul"
MACHINE_SOCARCH_SUFFIX:mx8mpul-nxp-bsp = "-mx8mpul"

# i.MX 8ULP
DEFAULTTUNE:mx8ulp-generic-bsp ?= "cortexa35-crypto"
MACHINEOVERRIDES_EXTENDER:mx8ulp:use-nxp-bsp = "imx-generic-bsp:imx-nxp-bsp:imxdrm:imxgpu:imxgpu2d:imxgpu3d:mx8-generic-bsp:mx8-nxp-bsp:mx8ulp-generic-bsp:mx8ulp-nxp-bsp"
MACHINEOVERRIDES_EXTENDER:mx8ulp:use-mainline-bsp = "imx-generic-bsp:imx-mainline-bsp:mx8-generic-bsp:mx8-mainline-bsp:mx8ulp-generic-bsp:mx8ulp-mainline-bsp"
MACHINEOVERRIDES_EXTENDER_FILTER_OUT += "mx8ulp"
MACHINE_SOCARCH_SUFFIX:mx8ulp-nxp-bsp = "-mx8ulp"

# i.MX 8DXL A1
MACHINEOVERRIDES_EXTENDER:mx8dxla1:use-nxp-bsp = "imx-generic-bsp:imx-nxp-bsp:imxfbdev:mx8-generic-bsp:mx8-nxp-bsp:mx8x-generic-bsp:mx8x-nxp-bsp:mx8dxl-generic-bsp:mx8dxl-nxp-bsp:mx8dxla1-generic-bsp:mx8dxla1-nxp-bsp"
MACHINEOVERRIDES_EXTENDER:mx8dxla1:use-mainline-bsp = "imx-generic-bsp:imx-mainline-bsp:mx8-generic-bsp:mx8-mainline-bsp:mx8x-generic-bsp:mx8x-mainline-bsp:mx8dxl-generic-bsp:mx8dxl-mainline-bsp:mx8dxla1-generic-bsp:mx8dxla1-mainline-bsp"

# i.MX 8DXL B0
MACHINEOVERRIDES_EXTENDER:mx8dxlb0:use-nxp-bsp = "imx-generic-bsp:imx-nxp-bsp:imxfbdev:mx8-generic-bsp:mx8-nxp-bsp:mx8x-generic-bsp:mx8x-nxp-bsp:mx8dxl-generic-bsp:mx8dxl-nxp-bsp:mx8dxlb0-generic-bsp:mx8dxlb0-nxp-bsp"
MACHINEOVERRIDES_EXTENDER:mx8dxlb0:use-mainline-bsp = "imx-generic-bsp:imx-mainline-bsp:mx8-generic-bsp:mx8-mainline-bsp:mx8x-generic-bsp:mx8x-mainline-bsp:mx8dxl-generic-bsp:mx8dxl-mainline-bsp:mx8dxlb0-generic-bsp:mx8dxlb0-mainline-bsp"

# i.MX 93
MACHINEOVERRIDES_EXTENDER:mx93:use-nxp-bsp  = "imx-generic-bsp:imx-nxp-bsp:imxfbdev:imxpxp:mx9-generic-bsp:mx9-nxp-bsp:mx93-generic-bsp:mx93-nxp-bsp"
MACHINEOVERRIDES_EXTENDER_FILTER_OUT += "mx93"
MACHINE_SOCARCH_SUFFIX:mx93-nxp-bsp = "-mx93"
SOC_DEFAULT_WKS_FILE:mx9-nxp-bsp ?= "imx-imx-boot-bootpart.wks.in"
