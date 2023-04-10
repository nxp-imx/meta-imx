# This file is included from meta-freescale/conf/machine/include/imx-base.inc
# and provides a simple mechanism to override settings in the file

UBOOT_PROVIDES_BOOT_CONTAINER:imx-nxp-bsp = "0"
UBOOT_PROVIDES_BOOT_CONTAINER:mx8m-nxp-bsp = "0"

IMX_SOC_REV       ??= ""
IMX_SOC_REV_LOWER   = "${@d.getVar('IMX_SOC_REV').lower()}"
IMX_SOC_REV_UPPER   = "${@d.getVar('IMX_SOC_REV').upper()}"

# i.MX 8M Plus UltraLite
MACHINEOVERRIDES_EXTENDER:mx8mpul:use-nxp-bsp = "imx-generic-bsp:imx-nxp-bsp:imxfbdev:mx8-generic-bsp:mx8-nxp-bsp:mx8m-generic-bsp:mx8m-nxp-bsp:mx8mpul-generic-bsp:mx8mpul-nxp-bsp"
MACHINEOVERRIDES_EXTENDER:mx8mpul:use-mainline-bsp = "imx-generic-bsp:imx-mainline-bsp:mx8-generic-bsp:mx8-mainline-bsp:mx8m-generic-bsp:mx8m-mainline-bsp:mx8mpul-generic-bsp:mx8mpul-mainline-bsp"
MACHINEOVERRIDES_EXTENDER_FILTER_OUT += "mx8mpul"
MACHINE_SOCARCH_SUFFIX:mx8mpul-nxp-bsp = "-mx8mpul"

# i.MX 6 & 7 stay on weston 10.0 for fbdev
PREFERRED_VERSION_weston:mx6-nxp-bsp ??= "10.0.3.imx"
PREFERRED_VERSION_weston:mx7-nxp-bsp ??= "10.0.3.imx"
PREFERRED_VERSION_weston:imx-nxp-bsp ??= "11.0.1.imx"

PREFERRED_VERSION_wayland-protocols:mx6-nxp-bsp ??= "1.31.imx"
PREFERRED_VERSION_wayland-protocols:mx7-nxp-bsp ??= "1.31.imx"
PREFERRED_VERSION_wayland-protocols:mx8-nxp-bsp ??= "1.31.imx"
PREFERRED_VERSION_wayland-protocols:mx9-nxp-bsp ??= "1.31.imx"

PREFERRED_VERSION_ffmpeg ??= "4.4.1"

PREFERRED_VERSION_libdrm:mx6-nxp-bsp ??= "2.4.114.imx"
PREFERRED_VERSION_libdrm:mx7-nxp-bsp ??= "2.4.114.imx"
PREFERRED_VERSION_libdrm:mx8-nxp-bsp ??= "2.4.114.imx"
PREFERRED_VERSION_libdrm:mx9-nxp-bsp ??= "2.4.114.imx"

PREFERRED_VERSION_optee-client:mx6-nxp-bsp ??= "3.19.0.imx"
PREFERRED_VERSION_optee-client:mx7-nxp-bsp ??= "3.19.0.imx"
PREFERRED_VERSION_optee-client:mx8-nxp-bsp ??= "3.19.0.imx"
PREFERRED_VERSION_optee-client:mx9-nxp-bsp ??= "3.19.0.imx"
PREFERRED_VERSION_optee-os:mx6-nxp-bsp     ??= "3.19.0.imx"
PREFERRED_VERSION_optee-os:mx7-nxp-bsp     ??= "3.19.0.imx"
PREFERRED_VERSION_optee-os:mx8-nxp-bsp     ??= "3.19.0.imx"
PREFERRED_VERSION_optee-os:mx9-nxp-bsp     ??= "3.19.0.imx"
PREFERRED_VERSION_optee-test:mx6-nxp-bsp   ??= "3.19.0.imx"
PREFERRED_VERSION_optee-test:mx7-nxp-bsp   ??= "3.19.0.imx"
PREFERRED_VERSION_optee-test:mx8-nxp-bsp   ??= "3.19.0.imx"
PREFERRED_VERSION_optee-test:mx9-nxp-bsp   ??= "3.19.0.imx"
PREFERRED_VERSION_optee-os-tadevkit:mx6-nxp-bsp   ??= "3.19.0.imx"
PREFERRED_VERSION_optee-os-tadevkit:mx7-nxp-bsp   ??= "3.19.0.imx"
PREFERRED_VERSION_optee-os-tadevkit:mx8-nxp-bsp   ??= "3.19.0.imx"
PREFERRED_VERSION_optee-os-tadevkit:mx9-nxp-bsp   ??= "3.19.0.imx"

PREFERRED_VERSION_opencv:mx8-nxp-bsp ??= "4.7.0.imx"
PREFERRED_VERSION_opencv:mx9-nxp-bsp ??= "4.7.0.imx"

SOC_DEFAULT_IMAGE_FSTYPES = "wic.bmap wic.zst tar.zst"
ZSTD_COMPRESSION_LEVEL ?= "-10"
