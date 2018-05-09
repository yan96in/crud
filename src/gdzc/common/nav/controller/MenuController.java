package gdzc.common.nav.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MenuController {
	@RequestMapping("/loadPage")
	public String loadPage(String id) {
		if (id != null) {
			switch (id) {
			case "index":
				return "index-content";
			case "nav":
				return "nav";
			case "nav2":
				return "nav2";
			case "detail":
				return "tabs";
			case "add-baseinfo":
				return "base/info/add";
			case "add-network-config":
				return "/equipment/network/config/add";
			case "add-network-port":
				return "/equipment/network/port/add";
			case "baseinfo-tab":
				return "/base/info/detail";
			case "config-tab":
				return "/equipment/network/config/detail";
			case "port-tab":
				return "/equipment/network/port/detail";
			case "network":
				return "/equipment/network/network";
			case "router":
				return "/equipment/network/router";
			case "switch":
				return "/equipment/network/switch";
			case "fiber":
				return "/equipment/network/fiber";
			case "network-other":
				return "/equipment/network/other";
			case "storage":
				return "/equipment/storage/storage";
			case "server":
				return "/equipment/server/server";
			case "database":
				return "/equipment/server/database";
			case "application":
				return "/equipment/server/application";
			case "vitual":
				return "/equipment/server/vitual";
			case "server-other":
				return "/equipment/server/other";
			case "safe":
				return "/equipment/safe/safe";
			case "firewall":
				return "/equipment/safe/firewall";
			case "ca":
				return "/equipment/safe/ca";
			case "safe-other":
				return "/equipment/safe/other";
			case "video":
				return "/equipment/video/video";
			case "base":
				return "/equipment/base/base";
			case "fresh-air":
				return "/equipment/base/fresh-air/detail";
			case "ups":
				return "/equipment/base/ups/detail";
			case "refrigerat":
				return "/equipment/base/refriger/detail";
			case "fire-fight":
				return "/equipment/base/fire-fight/detail";
			case "distribute":
				return "/equipment/base/distribute/detail";
			case "other":
				return "/equipment/base/other/detail";
			}
		}
		return "coming";
	}
}
