# This file is included from meta-freescale/conf/machine/include/imx-base.inc
# and provides a simple mechanism to override settings in the file

# i.MX 8M Nano UltraLite
MACHINEOVERRIDES_EXTENDER:mx8mnul:use-nxp-bsp = "imxfbdev"
MACHINE_SOCARCH_SUFFIX:mx8mnul-nxp-bsp = "-mx8mnul"

# i.MX 8M Plus UltraLite
MACHINEOVERRIDES_EXTENDER:mx8mpul:use-nxp-bsp = "imxfbdev"
MACHINE_SOCARCH_SUFFIX:mx8mpul-nxp-bsp = "-mx8mpul"

# i.MX 8ULP
DEFAULTTUNE:mx8ulp-generic-bsp ?= "cortexa35-crypto"
MACHINEOVERRIDES_EXTENDER:mx8ulp:use-nxp-bsp = "imx-generic-bsp:imx-nxp-bsp:mx8-generic-bsp:mx8-nxp-bsp:mx8ulp-generic-bsp:mx8ulp-nxp-bsp:imxdrm:imxgpu:imxgpu2d:imxgpu3d"
MACHINEOVERRIDES_EXTENDER_FILTER_OUT:use-mainline-bsp += "mx8ulp"
MACHINE_SOCARCH_SUFFIX:mx8ulp-nxp-bsp = "-mx8ulp"
