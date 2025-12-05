# Yocto Project BSP for NXP i.MX Linux

The repository https://github.com/nxp-imx/meta-imx contains multiple Yocto Project layers supporting
Linux development for the NXP i.MX Series 6 through 9.

| Layer            | Purpose               |
|------------------|-----------------------|
| meta-imx-bsp     | BSP                   |
| meta-imx-cockpit | eCockpit              |
| meta-imx-ml      | Machine Learning      |
| meta-imx-sdk     | Distro                |
| meta-imx-v2x     | Vehicle-to-Everything |

The following development boards were tested in this release.

| Product/Family  | Board  | Machine Configuration Files                                               |
|-----------------|--------|---------------------------------------------------------------------------|
| i.MX 6ULZ       | EVK    | imx6ulz14x14evk                                                           |
| i.MX 6ULL       | EVK    | imx6ull14x14evk                                                           |
| i.MX 6UltraLite | EVK    | imx6ulevk                                                                 |
| i.MX 6SoloX     | SABRE  | imx6sxsabresd                                                             |
| i.MX 6Solo      | SABRE  | imx6solosabresd                                                           |
| i.MX 6DualLite  | SABRE  | imx6dlsabresd                                                             |
| i.MX 6Quad      | SABRE  | imx6qsabresd                                                              |
| i.MX 6QuadPlus  | SABRE  | imx6qpsabresd                                                             |
| i.MX 7ULP       | EVK    | imx7ulpevk                                                                |
| i.MX 7Dual      | SABRE  | imx7dsabresd                                                              |
| i.MX 8          | MEK    | imx8qmmek                                                                 |
| i.MX 8M         | EVK    | imx8mq-lpddr4-wevk, imx8mq-evk                                            |
| i.MX 8M Mini    | EVK    | imx8mm-lpddr4-evk, imx8mm-ddr4-evk                                        |
| i.MX 8M Nano    | EVK    | imx8mn-lpddr4-evk, imx8mn-ddr4-evk                                        |
| i.MX 8M Plus    | EVK    | imx8mp-lpddr4-evk, imx8mp-ddr4-evk                                        |
|                 | FRDM   | imx8mp-lpddr4-frdm                                                        |
| i.MX 8X         | MEK    | imx8qxpc0mek                                                              |
| i.MX 8XLite     | EVK    | imx8dxlb0-lpddr4-evk, imx8dxlb0-ddr3l-evk                                 |
| i.MX 8ULP       | EVK    | imx8ulp-lpddr4-evk, imx8ulp-9x9-lpddr4x-evk                               |
| i.MX 91         | EVK    | imx91-11x11-lpddr4-evk, imx91-9x9-lpddr4-qsb                              |
|                 | FRDM   | imx91-11x11-lpddr4-frdm, imx91-11x11-lpddr4-frdm-imx91s                   |
| i.MX 93         | EVK    | imx93-11x11-lpddr4x-evk, imx93-14x14-lpddr4x-evk, imx93-9x9-lpddr4-qsb    |
|                 | FRDM   | imx93-11x11-lpddr4x-frdm                                                  |
| i.MX 94         | EVK    | imx943-19x19-lpddr5-evk, imx943-15x15-lpddr4-evk, imx943-19x19-lpddr4-evk |
| i.MX 95         | EVK    | imx95-19x19-lpddr5-evk, imx95-15x15-lpddr4x-evk                           |
|                 | FRDM   | imx95-15x15-lpddr4x-frdm                                                  |
|                 | Verdin | imx95-19x19-verdin                                                        |

## Quick Start Guide

The following instructions show how to download and build the current release.

### Install the repo utility

Follow the instructions here: https://gerrit.googlesource.com/git-repo/+/HEAD/README.md

### Install essential host packages

Follow the instructions here: https://docs.yoctoproject.org/5.2.2/singleindex.html#build-host-packages

### Download the Yocto Project layers

Use the i.MX Linux BSP manifest repository to create the Yocto Project layers.
```
$: repo init -u https://github.com/nxp-imx/imx-manifest.git -b imx-linux-walnascar -m imx-6.12.49-2.2.0.xml
$: repo sync
```

### Setup a Yocto Project build folder

To setup a new build folder called `build`, run i.MX Linux Yocto Project Setup:
```
$: [MACHINE=<machine>] [DISTRO=<distro>] source ./imx-setup-release.sh -b build
where
    <distro>  defaults to fsl-imx-xwayland
    <machine> defaults to imx6qsabresd
```

#### End User License Agreement

The NXP i.MX End User License Agreement (EULA) is displayed during the setup process.
Please read it carefully. The license must be accepted to allow access to the NXP
EULA-licensed recipes.

#### Distro Configuration

Depending on the i.MX Series, the BSP supports different graphics backends and different
distros to highlight those.

| Series           | Distro Name      | Description                                                                  |
|------------------|------------------|------------------------------------------------------------------------------|
| 6 and 7          | fsl-imx-fb       | Framebuffer backend                                                          |
| 6-9              | fsl-imx-wayland  | Weston desktop on Wayland backend, includes framebuffer support              |
| 6-9              | fsl-imx-xwayland | Weston desktop on Wayland backend, includes framebuffer and XWayland support |

#### Setup for an existing build folder

In order to configure a Linux shell for building in an existing build folder:
```
$: cd <build folder>/..
$: source ./setup-environment <build folder>
```

### Build an image

Three different images are provided in the distribution layer.

| Image Name           | Description                                       |
|----------------------|---------------------------------------------------|
| imx-image-core       | base image with Weston desktop                    |
| imx-image-multimedia | imx-image-core plus multimedia                    |
| imx-image-full       | imx-image-multimedia plus Qt and machine learning |

Here's an example:
```
$: bitbake imx-image-full
```
