require recipes-graphics/xorg-font/xorg-font-common.inc

SUMMARY = "Adobe 100 DPI fonts"
HOMEPAGE = "http://cgit.freedesktop.org/xorg/font/adobe-100dpi/"
SECTION = "x11/font"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=5dfa0fdf45473b4ca0acf37d854df10e"

DEPENDS = "util-macros-native font-util-native bdftopcf-native font-util"
RDEPENDS:${PN} = "encodings font-util"
RDEPENDS:${PN}:class-native = "font-util-native"

UPSTREAM_CHECK_REGEX = "font\-adobe\-100dpi\-(?P<pver>\d+(\.\d+)+).tar.gz"

inherit features_check
# depends on bdftopcf-native -> virtual/libx11
REQUIRED_DISTRO_FEATURES = "x11"

SRC_URI[sha256sum] = "b2c08433eab5cb202470aa9f779efefce8d9cab2534f34f3aa4a31d05671c054"
