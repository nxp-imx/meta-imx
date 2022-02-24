# This file is included from meta-freescale/conf/machine/include/imx-base.inc
# and provides a simple mechanism to override settings in the file

# i.MX 8M Nano UltraLite
MACHINEOVERRIDES_EXTENDER:mx8mnul:use-nxp-bsp = "imx-generic-bsp:imx-nxp-bsp:mx8-generic-bsp:mx8-nxp-bsp:mx8m-generic-bsp:mx8m-nxp-bsp:mx8mnul-generic-bsp:mx8mnul-nxp-bsp:imxfbdev"
MACHINEOVERRIDES_EXTENDER:mx8mnul:use-mainline-bsp = "imx-generic-bsp:imx-mainline-bsp:mx8-generic-bsp:mx8-mainline-bsp:mx8m-generic-bsp:mx8m-mainline-bsp:mx8mnul-generic-bsp:mx8mnul-mainline-bsp"
MACHINEOVERRIDES_EXTENDER_FILTER_OUT += "mx8mnul"
MACHINE_SOCARCH_SUFFIX:mx8mnul-nxp-bsp = "-mx8mnul"

# i.MX 8M Plus UltraLite
MACHINEOVERRIDES_EXTENDER:mx8mpul:use-nxp-bsp = "imx-generic-bsp:imx-nxp-bsp:mx8-generic-bsp:mx8-nxp-bsp:mx8m-generic-bsp:mx8m-nxp-bsp:mx8mpul-generic-bsp:mx8mpul-nxp-bsp:imxfbdev"
MACHINEOVERRIDES_EXTENDER:mx8mpul:use-mainline-bsp = "imx-generic-bsp:imx-mainline-bsp:mx8-generic-bsp:mx8-mainline-bsp:mx8m-generic-bsp:mx8m-mainline-bsp:mx8mpul-generic-bsp:mx8mpul-mainline-bsp"
MACHINEOVERRIDES_EXTENDER_FILTER_OUT += "mx8mpul"
MACHINE_SOCARCH_SUFFIX:mx8mpul-nxp-bsp = "-mx8mpul"

# i.MX 8ULP
DEFAULTTUNE:mx8ulp-generic-bsp ?= "cortexa35-crypto"
MACHINEOVERRIDES_EXTENDER:mx8ulp:use-nxp-bsp = "imx-generic-bsp:imx-nxp-bsp:mx8-generic-bsp:mx8-nxp-bsp:mx8ulp-generic-bsp:mx8ulp-nxp-bsp:imxdrm:imxgpu:imxgpu2d:imxgpu3d"
MACHINEOVERRIDES_EXTENDER:mx8ulp:use-mainline-bsp = "imx-generic-bsp:imx-mainline-bsp:mx8-generic-bsp:mx8-mainline-bsp:mx8ulp-generic-bsp:mx8ulp-mainline-bsp"
MACHINEOVERRIDES_EXTENDER_FILTER_OUT += "mx8ulp"
MACHINE_SOCARCH_SUFFIX:mx8ulp-nxp-bsp = "-mx8ulp"
